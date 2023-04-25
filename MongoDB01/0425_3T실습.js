use shop5

db.memo.find({})

db.createCollection("member")

db.member.insertOne({
    "id":"hong",
    "pw" : "1234",
    "name":"honggildong",
    "tel" : 011
})

db.member.insertOne({
    "id":"kim",
    "pw" : "1234",
    "name":"kimdong",
    "tel" : 012
})
db.member.insertOne({
    "id":"park",
    "pw" : "1234",
    "name":"parkdong",
    "tel" : 013
})

db.member.find({})

db.member.drop()

show collections

db.dropDatabase()

show dbs
