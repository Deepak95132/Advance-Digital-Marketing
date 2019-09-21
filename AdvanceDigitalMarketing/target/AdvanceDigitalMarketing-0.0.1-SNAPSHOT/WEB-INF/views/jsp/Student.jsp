<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 table {
  width:100%;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 50px;
  text-align: center;
  margin-left: 50px;
}
table#t01 tr:nth-child(even) {
  background-color: #eee;
}
table#t01 tr:nth-child(odd) {
 background-color: #fff;
}
table#t01 th {
  background-color: black;
  color: white;
}

#movebutton,#movebutton1 {
  text-decoration: none;
  display: inline-block;
  padding: 8px 16px;
  border:none;
  
}

#movebutton,#movebutton1:hover {
  background-color: #ddd;
  color: black;
}

.previous {
  background-color: #f1f1f1;
  color: black;
}

.next {
  background-color: #4CAF50;
  color: white;
}

.round {
  border-radius: 50%;
}
  </style>
</head>
<body>
 <table style="width:100%;" id="t01">
       <tr>
       <th>
		S/N       
       </th>
       <th>
      Student Name
       </th>
       <th>
       Ph. Number
       </th>
       <th>
       Student's Address
       </th>
       </tr>
        <tr>
       <td>
		1
       </td>
       <td>
       Name
       </td>
       <td>
       Phone Number
       </td>
       <td>
       Address
       </td>
       </tr>
        <tr>
       <td>
		1       
       </td>
       <td>
       Name
       </td>
       <td>
       Phone Number
       </td>
       <td>
       Address
       </td>
       </tr>
        <tr>
       <td>
		2      
       </td>
       <td>
       Name
       </td>
       <td>
       Phone Number
       </td>
       <td>
       Address
       </td>
       </tr>
        <tr>
       <td>
		3      
       </td>
       <td>
       Name
       </td>
       <td>
       Phone Number
       </td>
       <td>
       Address
       </td>
       </tr>
       </table>
       <br/>
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="#" class="previous" id="movebutton">&laquo; Previous</a>
<a href="#" class="next" id ="movebutton1">Next &raquo;</a>
</body>
</html>