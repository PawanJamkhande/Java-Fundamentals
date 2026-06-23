function Post(pname){
    this.pname=pname;
}

// add method prototype

Post.prototype.disp=function(){
    console.log("Post Name:"+this.pname)
};

let p=new Post("Java is secure")

p.disp()

class A{
    constructor(name){
  this.name=name;
    }

    show(){
        console.log(this.name)
    }
}

let a=new A("Maya")

a.show();








function Post(pname){
    this.pname=pname;
}

// add method prototype

Post.prototype.disp=
function(){
    console.log("Post Name:"+this.pname)
};

let l=new Post("Java is secure")

l.disp()