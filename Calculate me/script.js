const display = document.querySelector("#display");
const buttons = document.querySelectorAll("button");

buttons.forEach((item) => {
  item.onclick = () => {
    if (item.id == "clear") {
      display.innerText = "";
    } else if (item.id == "backspace") {
      let string = display.innerText.toString();
      display.innerText = string.substr(0, string.length - 1);
    } else if (display.innerText != "" && item.id == "equal") {
      display.innerText = eval(display.innerText.toString());
    } else if (display.innerText == "" && item.id == "equal") {
      display.innerText = "Empty!";
      setTimeout(() => (display.innerText = ""), 2000);
    } else {
      let op = ["/", "*", "+", "-"];
      let st = item.id.toString();
      let string = display.innerText.toString();
      console.log(string);
      let n = string.length;
      let lastop = string[n-1];
      if(op.includes(st) && op.includes(lastop)){
        string = string.substring(0, n-1);
        display.innerText = string;
      }
      display.innerText += item.id;
    }
  };
});

