function validateMyForm() {
    var firstName = document.getElementById("firstName");
    var lastName = document.getElementById("lastName");
    var birthDate = document.getElementById("birthDate");

    if (firstName.value == "" || lastName.value == "" || birthDate.value == "") {
        alert("Field(s) must be filled out");
        return false;
    }
}

function toogleFM() {
    var male = document.getElementById("Male");
    var female = document.getElementById("Female");
    var title = document.getElementById("title");
    if (male.checked) {
        changeColor("blue");
        title.innerText = "Hello Sir";
    }
    if (female.checked) {
        changeColor("red");
        title.innerText = "Hello Madam";
    }
}

function changeColor(color) {
    var fieldsets = document.getElementsByTagName("fieldset");
    for (i = 0; i < fieldsets.length; i++) {
        fieldsets[i].style.color = color;
        fieldsets[i].style.borderColor = color;
    }

}

