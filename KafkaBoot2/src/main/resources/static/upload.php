<html>
<body>

<?php

$filename = $_FILES['file']['name'];

$location = "upload/".$filename;

if(move_uploaded_file($_FILES['file']['tmp_name'], $location)){
    echo "File uploaded successfully";
}else{
    echo "Error";
}

?>

</body>
</html>