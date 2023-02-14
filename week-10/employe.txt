<?php 

// Koneksi ke database employe
$connection = mysqli_connect("localhost","root","","employe") 
or die("Error " . mysqli_error($connection)); 

// query ke table 
$sql = "select * from tbl_employee"; $result = mysqli_query($connection, $sql) or die("Error in Selecting " . mysqli_error($connection)); 

// pembuatan array
$emparray = array(); 
while($row =mysqli_fetch_assoc($result)){ 
	$emparray[] = $row;
	} 

// pembuatan json
echo json_encode($emparray);

// tutup koneksi 
mysqli_close($connection); 

?>