function calculateIMC() {
    var weight = document.getElementById('weight').value;
    var height = document.getElementById('height').value;

    if (weight !== '' && height !== '') {
        var bmi = weight / (height * height);
        displayResult(bmi);
    } else {
        alert('Por favor, preencha todos os campos.');
    }
}

function displayResult(bmi) {
    var resultDiv = document.getElementById('result');
    resultDiv.innerHTML = 'Seu IMC é: ' + bmi.toFixed(2);
}