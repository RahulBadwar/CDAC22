const express = require("express");
const { send, get } = require("express/lib/response");

const app = express();

const mysql = require("mysql2");

app.use(express.static("sf"));
let para = {
  host: "localhost",
  user: "root",
  password: "cdac",
  database: "wpt",
  port: 3306,
};

const con = mysql.createConnection(para);

app.get("/add", (req, res) => {
  //console.log(req);
  let x = req.query.no;
  let y = req.query.name;
  let z = req.query.price;

  console.log(x);
  console.log(y);
  console.log(x);
  let op = {};
  con.query("insert into item values(?,?,?)", [x, y, z], (err, data) => {
    if (err) {
      console.log(err);
    } else {
      if (data.affectedRows > 0) {
        console.log(data.affectedRows);
        res.send(op);
      }
    }
  });
});

app.get("/blur", (req, res) => {
  //console.log(req.query);

  let output = {
    status: false,
    itemdetail: { no: "0", name: "0", price: "0" },
  };

  con.query(
    "select * from item where itam_no=?",
    [req.query.no],
    (err, data) => {
      if (err) {
        console.log(err);
      } else {
        //console.log("data given by"+data[0]);
        if (data.length > 0) {
          //console.log("rows affeted");
          //console.log(data[0]);
          output.status = true;
          output.itemdetail = data[0];
        }
        res.send(output);
      }
    }
  );

  app.get("/update", (req, res) => {
    //console.log(req);

    let x = req.query.no;
    let y = req.query.name;
    let z = req.query.price;

    console.log(x + " " + y + " " + z);

    con.query(
      "update  item set item_name=?,item_price=? where itam_no=?",
      [y, z, x],
      (err, data) => {
        if (err) {
          console.log(err);
        } else {
          if (data.affectedRows > 0) {
            console.log("update sucessfull");
          }
        }
      }
    );
  });
});

app.get("/getAll", (req, res) => {
  //console.log(req);
  //console.log("in getAll function");
  let output = { status: false, itemdetails: [{ no: 0, name: 0, price: 0 }] };
  con.query("select * from item", [], (err, data) => {
    if (err) {
      console.log(err);
    } else {
      //console.log(data);
      output.status = true;
      output.itemdetails = data;
      // console.log(output);
    }
    res.send(output);
  });
});

app.get("/remove", (req, res) => {
  //console.log(req);
  console.log("in remove get");
  let output = {};

  let x = req.query.no;
  let y = req.query.name;
  let z = req.query.price;
  console.log(x + " " + y + " " + z);

  con.query("delete from item where itam_no=?", [x], (err, data) => {
    if (err) {
      console.log(err);
    } else {
      if (data.affectedRows > 0) {
        console.log("in remove succesful");
      }
    }
  });

  res.send(output);
});

app.listen(502, () => {
  console.log("server is running");
});
