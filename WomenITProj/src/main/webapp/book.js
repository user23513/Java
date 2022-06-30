/**
 * book.js
 */


document.addEventListener('DOMContentLoaded', function () {

    // 전체리스트 출력
    fetch('BookServelt', {
            method: 'post',
            headers: {
                'Content-type': 'application/x-www-form-urlencoded'
            },
            body: `cmd=list`
        })
        .then(result => result.json())
        .then(result => showList(result))
        .catch(err => console.log(err));

    // 리스트 테이블로 출력 콜백함수    
    function showList(result) {
        // result : 전체 리스트 배열
        let tbody = document.querySelector('tbody');
        result.forEach(list => tbody.append(makeTr(list)));
    }

    // tr 생성함수
    function makeTr(list) {
        let tr = document.createElement('tr');
        let td = document.createElement('td');

        let checkbox = document.createElement('input');
        checkbox.setAttribute('type', 'checkbox');
        td.append(checkbox);
        tr.append(td);

        for (let key in list) {
            let td = document.createElement('td');
            td.textContent = list[key];
            tr.append(td);
        }

        td = document.createElement('td');
        let btn = document.createElement('button')
        btn.textContent = '삭제';
        btn.addEventListener('click', deleteCallBack)
        td.append(btn);
        tr.append(td);

        return tr;
    }


    // 저장버튼 눌렀을 때 입력
    document.getElementById('submit').addEventListener('click', submitCallBack)

    function submitCallBack(e) {
        e.preventDefault();

        let code = document.getElementById('bookCode').value;
        let name = document.getElementById('bookName').value;
        let auth = document.getElementById('bookAuth').value;
        let pres = document.getElementById('bookPres').value;
        let amt = document.getElementById('bookAmt').value;

        fetch('BookServelt', {
                method: 'post',
                headers: {
                    'Content-type': 'application/x-www-form-urlencoded'
                },
                body: `cmd=insert&code=${code}&name=${name}&auth=${auth}&pres=${pres}&amt=${amt}`
            })
            .then(result => result.json())
            .then(result => {
                let tbody = document.querySelector('tbody');
                tbody.append(makeTr(result));
            })
            .catch(err => console.log(err));

            document.getElementById('bookCode').value = '';
            document.getElementById('bookName').value = '';
            document.getElementById('bookAuth').value = '';
            document.getElementById('bookPres').value = '';
            document.getElementById('bookAmt').value = '';


    }

    // 삭제버튼 눌렀을 때 콜백함수
    function deleteCallBack(e) {
        let code = e.target.parentElement.parentElement.children[1].textContent;
        console.log(code)

        // 디비 삭제
        fetch('BookServelt', {
                method: 'post',
                headers: {
                    'Content-type': 'application/x-www-form-urlencoded'
                },
                body: `cmd=delete&code=${code}`
            })
            .then(result => result.json())
            .then(result => {
                console.log(result)
            })
            .catch(err => console.log(err));

        // 화면 삭제
        e.target.parentElement.parentElement.remove();
    }


    // 체크된것만 선택삭제
    document.getElementById('selectDel').addEventListener('click', selectDelCallBack);
    document.querySelector('thead input[type=checkbox]').addEventListener('click', function(e) {
        console.log(e.target.checked)
        if (e.target.checked) {
            $('tbody input[type="checkbox"]').attr("checked", true);
        }else {
            $('tbody input[type="checkbox"]').attr("checked", false);
        }
    })

    function selectDelCallBack(e) {
        let checkboxs = document.querySelectorAll('tbody input[type=checkbox]');
        
        checkboxs.forEach(checkbox => {
            let tr = checkbox.parentElement.parentElement;
            if (checkbox.checked) {
                let code = tr.children[1].textContent;
                // 체크된 것만 디비 삭제
                fetch('BookServelt', {
                        method: 'post',
                        headers: {
                            'Content-type': 'application/x-www-form-urlencoded'
                        },
                        body: `cmd=delete&code=${code}`
                    })
                    .then(result => result.json())
                    .then(result => {
                        console.log(result)
                    })
                    .catch(err => console.log(err));

                // 화면삭제
                tr.remove();
            }
        });

    }



});