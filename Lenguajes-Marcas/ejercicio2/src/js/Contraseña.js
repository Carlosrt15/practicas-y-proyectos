function passwordGenerator(){
    const min = "qwertyuiopasdfghjklñzxcvbnm";
    const mayus = "QWERTYUIIOPASDFGHJKLÑZXCVBNM";

    var password = '';

    for (var i = 1; i <= 12; i++){
        var choose = Math.floor(Math.random()* 3 + 1);

        if(choose == 1){
            var character1 = min.charAt(Math.floor(Math.random()*mayus.length));
            password += character1;
        } else {

            if (choose == 2){
                var character2 = mayus.charAt(Math.floor(Math.random()* mayus.length));
                password += character2;


            }else{
                var num = Math.floor(Math.random() * 10);
                password += num;
            }
        }
        
    }

    alert(password);

    


}