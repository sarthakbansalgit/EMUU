(function () {
    "use strict";

    var gate = document.getElementById("passcodeGate");
    var form = document.getElementById("passcodeForm");
    var input = document.getElementById("passcode");
    var message = document.getElementById("passcodeMessage");
    var submitButton = form && form.querySelector("button[type='submit']");
    var passcode = "24020412";

    if (!gate || !form || !input || !message || !submitButton) {
        return;
    }

    input.focus();

    form.addEventListener("submit", function (event) {
        event.preventDefault();
        message.textContent = "";
        input.classList.remove("passcode-error");

        if (input.value === passcode) {
            gate.classList.add("passcode-gate-hidden");
            input.disabled = true;
            submitButton.disabled = true;
            window.setTimeout(function () {
                window.location.replace("heart.html");
            }, 500);
            return;
        }

        input.value = "";
        input.classList.add("passcode-error");
        message.textContent = "That secret code is not quite right.";
        input.focus();
    });
}());
