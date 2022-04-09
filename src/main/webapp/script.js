function clearScreen() {
 document.getElementById("result").value = "";
}

function clearScreen2() {
 document.getElementById("result2").value = "";
}

// This function display values
function display(value) {
 document.getElementById("result").value += value;
}

function display2(value) {
 document.getElementById("result2").value += value;
}

// This function evaluates the expression and return result
function calculatePower() {
 var p = document.getElementById("result").value;
 var b = document.getElementById("result2").value;

    fetch('http://localhost:8081/getpower', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            input1:p,
            input2:b
        })
    }).then(response => response.json())
        .then((data) => {
            document.getElementById("finalresult").value = data;
        });
}
function calculateRoot() {
 var p = document.getElementById("result").value;
    fetch('http://localhost:8081/getsqrt', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            input1:p,

        })
    }).then(response => response.json())
        .then((data) => {

            document.getElementById("result").value = data;
        });
 // document.getElementById("result").value = q;
}

function calculateLog() {

 var p = document.getElementById("result").value;
    fetch('http://localhost:8081/getlog', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            input1:p,
        })
    }).then(response => response.json())
        .then((data) => {

            document.getElementById("result").value = data;
        });
}

function calculateFact() {
 var p = document.getElementById("result").value;

    fetch('http://localhost:8081/getfact', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            input1:p,
        })
    }).then(response => response.json())
        .then((data) => {

            document.getElementById("result").value = data;
        });
 // document.getElementById("result").value = fact;

    // console.log(`The factorial of ${number} is ${fact}.`);

}

