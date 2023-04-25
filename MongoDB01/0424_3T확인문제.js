db.getCollection("memo").find({})

db.memo.find({office:'Wordware'},{age:1,phone:1})

db.memo.find({age:1},{office:1,name:1}).count()

db.memo.insertOne({age: 200, name: "hong", office: "busan", phone: "011"})

db.memo.find({})

db.memo.updateOne({age:2},{$set:{office:'seoul'}})

db.memo.find({$or:[{age:2},{office:'busan'}]})

db.memo.deleteOne({age:3})

db.memo.updateOne({name:'Didi'},{$set:{office:'ulsan'}})

db.memo.find({name:'Didi'})

db.memo.deleteMany({})

db.memo.find()

db.memo.drop()

show collections