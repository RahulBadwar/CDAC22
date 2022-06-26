const express=require("express");
const { send } = require("express/lib/response");
const app=express();
app.use(express.static("sf"));
const mysql=require('mysql2');

let dpara={
    host: "localhost",
    user: "root",
    password: "cdac",
    database: "wpt",
    port: 3306,
  };

const con=mysql.createConnection(dpara);


app.get("/add",(req,res)=>{
//console.log(req);
let x=req.query.subno;
let y=req.query.sub;
let z=req.query.mark;
con.query('insert into marks values(?,?,?)',[x,y,z],(err,data)=>{
let output={status:false}
if(err){
    console.log(err);
}
else{
    if(data.affectedRows>0){
        console.log(" data inserted suceesfully ");
    }
}
})
res.send({});
})

app.get("/blur",(req,res)=>{
    //console.log(req);
    let x=req.query.subno;

    con.query('select * from marks where subno=?',[x],(err,data)=>{
        let ouput={}
        if(err){
        console.log(err);
        }
        else{
            if(data.length>0){
                console.log(data+"data from server");
                res.send(data);
            }
            else{
                res.send({});
            }
        }
    })
     
})
 app.get("/update",(req,res)=>{
let x=req.query.subno;
let y=req.query.sub;
let z=req.query.mark;
console.log(x+" "+y+" "+z);

con.query('update marks set sub=?,mark=? where subno=?',[y,z,x],(err,data)=>{
    if(err){
        console.log(err);
    }
    else{
        if(data.affectedRows>0){
            console.log("data updated");
        }
    }
})
res.send({});
})    

app.get("/delete",(req,res)=>{
//console.log(req);
let x=req.query.subno;

con.query('delete from marks where subno=?',[x],(err,data)=>{
    if(err){
        console.log(err);
    }
    else{
        if(data.affectedRows>0){
            console.log("deleted suceesfully");
        }
    }
})
})
app.get("/showall",(req,res)=>{
//console.log(req);

con.query('select * from marks',[],(err,data)=>{
    if(err){
        console.log(err);
    }
    else{
        if(data.length>0){
            res.send(data);
        }
        
    }
})


//res.send({});
})


app.listen(503,()=>{
    console.log("server is runnimg");
})