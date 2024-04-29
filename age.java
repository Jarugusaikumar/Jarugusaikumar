Function calculateAge() {
    Var dob = document.getElementById(‘dob’).value;
    Var today = new Date();
    Var birthDate = new Date(dob);
    Var age = today.getFullYear() – birthDate.getFullYear();
    Var m = today.getMonth() – birthDate.getMonth();
    If (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) {
        Age--;
    }
    Document.getElementById(‘result’).innerHTML = “You are “ + age + “ years old.”;
}

