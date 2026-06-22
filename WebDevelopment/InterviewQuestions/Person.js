class person{
    show(){
        console.log("this is show method")
    }
}

class Info extends person{
    disp(){
       console.log("this is info method") 
    }
}

let i1=new Info();
i1.disp()
i1.show();