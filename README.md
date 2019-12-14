# springboot-mongo

http://localhost:8080/orderservice/placeOrder

{
	"id" : 14,
	"name": "B-Name",
	"gender":"male",
	"products" :[
		{
			"name" : "C-product 1",
			"quantity":1,
			"price":10
		},
		{
			"name" : "C-product 2",
			"quantity":2,
			"price":10
		}
	],
	"address":{
		"city":"coimbatore",
		"state" :"TamilNadu",
		"pincode": "600001"
	}
	
}

http://localhost:8080/orderservice/getUserByName/B-Name

[
    {
        "id": 13,
        "name": "B-Name",
        "gender": "male",
        "products": [
            {
                "name": "B-product 1",
                "qty": 0,
                "price": 10
            },
            {
                "name": "B-product 2",
                "qty": 0,
                "price": 10
            }
        ],
        "address": {
            "city": "chennai",
            "state": "TamilNadu",
            "pincode": "600001"
        }
    },
    {
        "id": 14,
        "name": "B-Name",
        "gender": "male",
        "products": [
            {
                "name": "C-product 1",
                "qty": 0,
                "price": 10
            },
            {
                "name": "C-product 2",
                "qty": 0,
                "price": 10
            }
        ],
        "address": {
            "city": "coimbatore",
            "state": "TamilNadu",
            "pincode": "600001"
        }
    }
]


http://localhost:8080/orderservice/getUserByAddress/chennai

[
    {
        "id": 12,
        "name": "A-Name",
        "gender": "male",
        "products": [
            {
                "name": "A-product 1",
                "qty": 0,
                "price": 10
            },
            {
                "name": "A-product 2",
                "qty": 0,
                "price": 10
            }
        ],
        "address": {
            "city": "chennai",
            "state": "TamilNadu",
            "pincode": "600001"
        }
    },
    {
        "id": 13,
        "name": "B-Name",
        "gender": "male",
        "products": [
            {
                "name": "B-product 1",
                "qty": 0,
                "price": 10
            },
            {
                "name": "B-product 2",
                "qty": 0,
                "price": 10
            }
        ],
        "address": {
            "city": "chennai",
            "state": "TamilNadu",
            "pincode": "600001"
        }
    }
]
