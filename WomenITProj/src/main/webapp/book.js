/**
 * book.js
 */

document.addEventListener('DOMContentLoaded', function () {

    // 출력
    $.ajax({
        url: 'BookServlet',
        success: function (result) {
            // 출력정보를 tbody안에 넣어서 표형식으로 출력
            makeTr(result);
        },
        error: function (err) {
            console.log(err);
        }
    });

    // tr만드는 함수
    function makeTr(result) {
        let tbody = $('#show table tbody')


        $(result).each((idx, elem) => {
	
        let btn = $('<button />').text('삭제');
        btn.on('click', deleteCallBack);
        
        let checkbox = $('<input />').attr('type', 'checkbox');
        
        
            tbody.append($('<tr />')
                .append($('<td />').append(checkbox), 
                                           $('<td />').text(elem.bookCode), 
                                           $('<td />').text(elem.bookName), 
                                           $('<td />').text(elem.bookAuth), 
                                           $('<td />').text(elem.bookPres), 
                                           $('<td />').text(elem.bookAmt), 
                                           $('<td />').append(btn)

                ))
        });

    }

    // 버튼 콜백함수
    function deleteCallBack(e) {
        let tr = $(e.target).parent().parent();
            // 삭제 버튼 클릭 => 데이터삭제, 화면에서 삭제
            
            // 데이터 삭제
            $.ajax({
                url: 'BookServlet',
                method: 'post',
                data: `cmd=delete&bookCode=${tr.children()[1].textContent}`,
                success: function (result) {
                    console.log(result);
                },
                error: function (err) {
                    console.log(err);
                }
            });

            // 화면에서 삭제
            tr.remove();
    }

    // 입력
    $('form[name="bookFrm"]').on('submit', bookAddCallBack);
	// 저장버튼 눌렀을 때 이벤트
    function bookAddCallBack(e) {
		e.preventDefault();
		
		console.log(document.getElementById('bookCode').value)
		
		let bookCode = document.getElementById('bookCode').value;
		let bookName = document.getElementById('bookName').value;
		let bookAuth = document.getElementById('bookAuth').value;
		let bookPres = document.getElementById('bookPres').value;
		let bookAmt = document.getElementById('bookAmt').value;
		
        $.ajax({
            url: 'BookServlet',
            method: 'post',
            data: `cmd=insert&bookCode=${bookCode}&bookName=${bookName}&bookAuth=${bookAuth}&bookPres=${bookPres}&bookAmt=${bookAmt}`,
            success: function (result) {
               makeTr(result);
               document.getElementById('bookCode').value='';
               document.getElementById('bookName').value='';
               document.getElementById('bookAuth').value='';
               document.getElementById('bookPres').value='';
               document.getElementById('bookAmt').value='';
            },
            error: function (err) {
                console.log(err)
            }
        })

    }

    // 선택삭제 
   document.getElementById('selectDel').addEventListener('click', function() {
        let checkboxs = document.querySelectorAll('tbody input[type="checkbox"]');
		
        console.log(checkboxs.parent);

        // 체크박스에 체크확인
        checkboxs.forEach(val => {
            let checkedTr = val.parentElement.parentElement;
            if(val.checked) {
                fetch('BookServlet', {
                    method: 'post',
                    headers: {
                        'Content-type': 'application/x-www-form-urlencoded'
                    },  
                    body: `cmd=delete&bookCode=${checkedTr.children()[1].textContent}`

                })
                    .then(result=>result.json())
                    .then(result=>{
						console.log(result);
                        checkedTr.remove();
                    })
                    .catch(err=>console.log(err));
                

                
            }
        })
        

   })
   
    

})