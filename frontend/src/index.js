//index.html
//using event listeners for on-click hiding of
//elements based on links
document.addEventListener("DOMContentLoaded",()=>{
    const loginForm = document.querySelector("#loginAccount");
    const createForm = document.querySelector("#createAccount");

document.querySelector("#create-link").addEventListener("click", e =>{
    e.preventDefault();
    loginForm.classList.add("form-hidden");
    createForm.classList.remove("form-hidden");
});

document.querySelector("#login-link").addEventListener("click", e =>{
    e.preventDefault();
    loginForm.classList.remove("form-hidden");
    createForm.classList.add("form-hidden");

});
});

//statements.html
//get statements by html, pdf, xlsx by using event
//listener, xhr object, & open/onload/send functions
document.getElementById('html1').addEventListener('click', loadHTML);

function loadHTML(){
    //create xhr obj
    var xhr = new XMLHttpRequest();
    //OPEN - type, url/file, async
    xhr.open('GET', 'top10.html', true);

    xhr.onload = function(){
        if(this.status == 200){
            /*HTTP STATUSES -
            200: "OK"
            403: "FORBIDDEN"
            404: "NOT FOUND"*/
            console.log(this.responseURL);
        }
    }

    //SEND - sends request
    xhr.send();
}

document.getElementById('pdf1').addEventListener('click', loadPDF);

    function loadPDF(){
        //create xhr obj
        var xhr = new XMLHttpRequest();
        //OPEN - type, url/file, async
        xhr.open('GET', 'top10.pdf', true);
    
        xhr.onload = function(){
            if(this.status == 200){
                /*HTTP STATUSES -
                200: "OK"
                403: "FORBIDDEN"
                404: "NOT FOUND"*/
                console.log(this.responseURL);
            }
        }
    
        //SEND - sends request
        xhr.send();
    }

document.getElementById('xlsx1').addEventListener('click', loadXLSX);

function loadXLSX(){
    //create xhr obj
    var xhr = new XMLHttpRequest();
    //OPEN - type, url/file, async
    xhr.open('GET', 'top10.xlsx', true);

    xhr.onload = function(){
        if(this.status == 200){
            /*HTTP STATUSES -
            200: "OK"
            403: "FORBIDDEN"
            404: "NOT FOUND"*/
            console.log(this.responseURL);
        }
    }

    //SEND - sends request
    xhr.send();
}
