<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<h2>Do calculation</h2>
<form class="container" action = "calHome" name = "calculateWebApp">
  <label for="input1">input 1 :</label><br>
  <input type="text" id="inp1" name="input1"><br>
  <label for="input2">input 2 :</label><br>
  <input type="text" id="inp2" name="input2"></br>
  <input type="radio" id="sum" name="calc" value="+">
  <label for="sum">SUM</label><br>
  <input type="radio" id="subtract" name="calc" value="-">
  <label for="subtract">SUBTRACT</label><br>
  <input type="radio" id="multiply" name="calc" value="*">
  <label for="multiply">MULTIPLY</label></br>
  <input type="radio" id="divide" name="calc" value="/">
  <label for="divide">DIVIDE</label></br>
  <input type="submit" value="submit">
</form>
</body>
</html>