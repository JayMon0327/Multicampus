use shop10
db.getCollection("memo").find({})

db.memo.find({}) //전체검색

db.memo.count({}) //document count

db.memo.insertOne({ //1개 insert
    "name":"apple",
    "age" : 100
})

db.memo.find({"name": "apple"}) // 조건검색 criteria

db.memo.find({"age": 100})

db.createCollection("member")

db.member.stats()

db.member.insertOne({
    "name":"hong2",
    "age" : 100,
    "tel" : "010"
})

db.member.find({})

db.createCollection("bbs")

db.bbs.insertOne({"title":"win"})

db.bbs.find({})

db.dropDatabase()

show databases