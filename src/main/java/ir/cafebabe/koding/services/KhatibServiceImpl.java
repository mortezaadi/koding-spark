package ir.cafebabe.koding.services;

import ir.cafebabe.koding.services.spi.AmirService;

public class KhatibServiceImpl implements AmirService {

	@Override
	public String getMenues() {
		return "[\n" + 
				"    {\n" + 
				"        \"Id\": 100,\n" + 
				"        \"Name\": \"Tablets\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"Count\": 5\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 200,\n" + 
				"        \"Name\": \"Cameras\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"Count\": 3\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 300,\n" + 
				"        \"Name\": \"Phones\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"Count\": 0\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 400,\n" + 
				"        \"Name\": \"PCs\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"Count\": 0\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 500,\n" + 
				"        \"Name\": \"کتاب\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"Count\": 0\n" + 
				"    }\n" + 
				"]";
	}

	@Override
	public String getProducts(int id) {
		// TODO Auto-generated method stub
		return "[\n" + 
				"    {\n" + 
				"        \"Id\": 0,\n" + 
				"        \"Name\": \"Product 0\",\n" + 
				"        \"Description\": \"description for the product 0\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 1,\n" + 
				"        \"Name\": \"Product 1\",\n" + 
				"        \"Description\": \"description for the product 1\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 2,\n" + 
				"        \"Name\": \"Product 2\",\n" + 
				"        \"Description\": \"description for the product 2\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 3,\n" + 
				"        \"Name\": \"Product 3\",\n" + 
				"        \"Description\": \"description for the product 3\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 4,\n" + 
				"        \"Name\": \"Product 4\",\n" + 
				"        \"Description\": \"description for the product 4\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 5,\n" + 
				"        \"Name\": \"Product 5\",\n" + 
				"        \"Description\": \"description for the product 5\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 6,\n" + 
				"        \"Name\": \"Product 6\",\n" + 
				"        \"Description\": \"description for the product 6\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 7,\n" + 
				"        \"Name\": \"Product 7\",\n" + 
				"        \"Description\": \"description for the product 7\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 8,\n" + 
				"        \"Name\": \"Product 8\",\n" + 
				"        \"Description\": \"description for the product 8\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 9,\n" + 
				"        \"Name\": \"Product 9\",\n" + 
				"        \"Description\": \"description for the product 9\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 10,\n" + 
				"        \"Name\": \"Product 10\",\n" + 
				"        \"Description\": \"description for the product 10\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 11,\n" + 
				"        \"Name\": \"Product 11\",\n" + 
				"        \"Description\": \"description for the product 11\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 12,\n" + 
				"        \"Name\": \"Product 12\",\n" + 
				"        \"Description\": \"description for the product 12\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 13,\n" + 
				"        \"Name\": \"Product 13\",\n" + 
				"        \"Description\": \"description for the product 13\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 14,\n" + 
				"        \"Name\": \"Product 14\",\n" + 
				"        \"Description\": \"description for the product 14\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 15,\n" + 
				"        \"Name\": \"Product 15\",\n" + 
				"        \"Description\": \"description for the product 15\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 16,\n" + 
				"        \"Name\": \"Product 16\",\n" + 
				"        \"Description\": \"description for the product 16\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 17,\n" + 
				"        \"Name\": \"Product 17\",\n" + 
				"        \"Description\": \"description for the product 17\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 18,\n" + 
				"        \"Name\": \"Product 18\",\n" + 
				"        \"Description\": \"description for the product 18\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 19,\n" + 
				"        \"Name\": \"Product 19\",\n" + 
				"        \"Description\": \"description for the product 19\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 20,\n" + 
				"        \"Name\": \"Product 20\",\n" + 
				"        \"Description\": \"description for the product 20\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 21,\n" + 
				"        \"Name\": \"Product 21\",\n" + 
				"        \"Description\": \"description for the product 21\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 22,\n" + 
				"        \"Name\": \"Product 22\",\n" + 
				"        \"Description\": \"description for the product 22\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 23,\n" + 
				"        \"Name\": \"Product 23\",\n" + 
				"        \"Description\": \"description for the product 23\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 24,\n" + 
				"        \"Name\": \"Product 24\",\n" + 
				"        \"Description\": \"description for the product 24\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 25,\n" + 
				"        \"Name\": \"Product 25\",\n" + 
				"        \"Description\": \"description for the product 25\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 26,\n" + 
				"        \"Name\": \"Product 26\",\n" + 
				"        \"Description\": \"description for the product 26\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 27,\n" + 
				"        \"Name\": \"Product 27\",\n" + 
				"        \"Description\": \"description for the product 27\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 28,\n" + 
				"        \"Name\": \"Product 28\",\n" + 
				"        \"Description\": \"description for the product 28\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 29,\n" + 
				"        \"Name\": \"Product 29\",\n" + 
				"        \"Description\": \"description for the product 29\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 30,\n" + 
				"        \"Name\": \"Product 30\",\n" + 
				"        \"Description\": \"description for the product 30\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 31,\n" + 
				"        \"Name\": \"Product 31\",\n" + 
				"        \"Description\": \"description for the product 31\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 32,\n" + 
				"        \"Name\": \"Product 32\",\n" + 
				"        \"Description\": \"description for the product 32\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 33,\n" + 
				"        \"Name\": \"Product 33\",\n" + 
				"        \"Description\": \"description for the product 33\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 34,\n" + 
				"        \"Name\": \"Product 34\",\n" + 
				"        \"Description\": \"description for the product 34\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 35,\n" + 
				"        \"Name\": \"Product 35\",\n" + 
				"        \"Description\": \"description for the product 35\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 36,\n" + 
				"        \"Name\": \"Product 36\",\n" + 
				"        \"Description\": \"description for the product 36\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 37,\n" + 
				"        \"Name\": \"Product 37\",\n" + 
				"        \"Description\": \"description for the product 37\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 38,\n" + 
				"        \"Name\": \"Product 38\",\n" + 
				"        \"Description\": \"description for the product 38\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 39,\n" + 
				"        \"Name\": \"Product 39\",\n" + 
				"        \"Description\": \"description for the product 39\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 40,\n" + 
				"        \"Name\": \"Product 40\",\n" + 
				"        \"Description\": \"description for the product 40\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 41,\n" + 
				"        \"Name\": \"Product 41\",\n" + 
				"        \"Description\": \"description for the product 41\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 42,\n" + 
				"        \"Name\": \"Product 42\",\n" + 
				"        \"Description\": \"description for the product 42\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 43,\n" + 
				"        \"Name\": \"Product 43\",\n" + 
				"        \"Description\": \"description for the product 43\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 44,\n" + 
				"        \"Name\": \"Product 44\",\n" + 
				"        \"Description\": \"description for the product 44\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 45,\n" + 
				"        \"Name\": \"Product 45\",\n" + 
				"        \"Description\": \"description for the product 45\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 46,\n" + 
				"        \"Name\": \"Product 46\",\n" + 
				"        \"Description\": \"description for the product 46\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 47,\n" + 
				"        \"Name\": \"Product 47\",\n" + 
				"        \"Description\": \"description for the product 47\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 48,\n" + 
				"        \"Name\": \"Product 48\",\n" + 
				"        \"Description\": \"description for the product 48\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 49,\n" + 
				"        \"Name\": \"Product 49\",\n" + 
				"        \"Description\": \"description for the product 49\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 50,\n" + 
				"        \"Name\": \"Product 50\",\n" + 
				"        \"Description\": \"description for the product 50\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 51,\n" + 
				"        \"Name\": \"Product 51\",\n" + 
				"        \"Description\": \"description for the product 51\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 52,\n" + 
				"        \"Name\": \"Product 52\",\n" + 
				"        \"Description\": \"description for the product 52\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 53,\n" + 
				"        \"Name\": \"Product 53\",\n" + 
				"        \"Description\": \"description for the product 53\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 54,\n" + 
				"        \"Name\": \"Product 54\",\n" + 
				"        \"Description\": \"description for the product 54\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 55,\n" + 
				"        \"Name\": \"Product 55\",\n" + 
				"        \"Description\": \"description for the product 55\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 56,\n" + 
				"        \"Name\": \"Product 56\",\n" + 
				"        \"Description\": \"description for the product 56\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 57,\n" + 
				"        \"Name\": \"Product 57\",\n" + 
				"        \"Description\": \"description for the product 57\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 58,\n" + 
				"        \"Name\": \"Product 58\",\n" + 
				"        \"Description\": \"description for the product 58\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 59,\n" + 
				"        \"Name\": \"Product 59\",\n" + 
				"        \"Description\": \"description for the product 59\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 60,\n" + 
				"        \"Name\": \"Product 60\",\n" + 
				"        \"Description\": \"description for the product 60\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 61,\n" + 
				"        \"Name\": \"Product 61\",\n" + 
				"        \"Description\": \"description for the product 61\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 62,\n" + 
				"        \"Name\": \"Product 62\",\n" + 
				"        \"Description\": \"description for the product 62\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 63,\n" + 
				"        \"Name\": \"Product 63\",\n" + 
				"        \"Description\": \"description for the product 63\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 64,\n" + 
				"        \"Name\": \"Product 64\",\n" + 
				"        \"Description\": \"description for the product 64\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 65,\n" + 
				"        \"Name\": \"Product 65\",\n" + 
				"        \"Description\": \"description for the product 65\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 66,\n" + 
				"        \"Name\": \"Product 66\",\n" + 
				"        \"Description\": \"description for the product 66\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 67,\n" + 
				"        \"Name\": \"Product 67\",\n" + 
				"        \"Description\": \"description for the product 67\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 68,\n" + 
				"        \"Name\": \"Product 68\",\n" + 
				"        \"Description\": \"description for the product 68\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 69,\n" + 
				"        \"Name\": \"Product 69\",\n" + 
				"        \"Description\": \"description for the product 69\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 70,\n" + 
				"        \"Name\": \"Product 70\",\n" + 
				"        \"Description\": \"description for the product 70\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 71,\n" + 
				"        \"Name\": \"Product 71\",\n" + 
				"        \"Description\": \"description for the product 71\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 72,\n" + 
				"        \"Name\": \"Product 72\",\n" + 
				"        \"Description\": \"description for the product 72\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 73,\n" + 
				"        \"Name\": \"Product 73\",\n" + 
				"        \"Description\": \"description for the product 73\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 74,\n" + 
				"        \"Name\": \"Product 74\",\n" + 
				"        \"Description\": \"description for the product 74\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 75,\n" + 
				"        \"Name\": \"Product 75\",\n" + 
				"        \"Description\": \"description for the product 75\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 76,\n" + 
				"        \"Name\": \"Product 76\",\n" + 
				"        \"Description\": \"description for the product 76\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 77,\n" + 
				"        \"Name\": \"Product 77\",\n" + 
				"        \"Description\": \"description for the product 77\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 78,\n" + 
				"        \"Name\": \"Product 78\",\n" + 
				"        \"Description\": \"description for the product 78\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 79,\n" + 
				"        \"Name\": \"Product 79\",\n" + 
				"        \"Description\": \"description for the product 79\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 80,\n" + 
				"        \"Name\": \"Product 80\",\n" + 
				"        \"Description\": \"description for the product 80\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 81,\n" + 
				"        \"Name\": \"Product 81\",\n" + 
				"        \"Description\": \"description for the product 81\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 82,\n" + 
				"        \"Name\": \"Product 82\",\n" + 
				"        \"Description\": \"description for the product 82\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 83,\n" + 
				"        \"Name\": \"Product 83\",\n" + 
				"        \"Description\": \"description for the product 83\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 84,\n" + 
				"        \"Name\": \"Product 84\",\n" + 
				"        \"Description\": \"description for the product 84\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 85,\n" + 
				"        \"Name\": \"Product 85\",\n" + 
				"        \"Description\": \"description for the product 85\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 86,\n" + 
				"        \"Name\": \"Product 86\",\n" + 
				"        \"Description\": \"description for the product 86\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 87,\n" + 
				"        \"Name\": \"Product 87\",\n" + 
				"        \"Description\": \"description for the product 87\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 88,\n" + 
				"        \"Name\": \"Product 88\",\n" + 
				"        \"Description\": \"description for the product 88\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 89,\n" + 
				"        \"Name\": \"Product 89\",\n" + 
				"        \"Description\": \"description for the product 89\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 90,\n" + 
				"        \"Name\": \"Product 90\",\n" + 
				"        \"Description\": \"description for the product 90\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 91,\n" + 
				"        \"Name\": \"Product 91\",\n" + 
				"        \"Description\": \"description for the product 91\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 92,\n" + 
				"        \"Name\": \"Product 92\",\n" + 
				"        \"Description\": \"description for the product 92\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 93,\n" + 
				"        \"Name\": \"Product 93\",\n" + 
				"        \"Description\": \"description for the product 93\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 94,\n" + 
				"        \"Name\": \"Product 94\",\n" + 
				"        \"Description\": \"description for the product 94\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 95,\n" + 
				"        \"Name\": \"Product 95\",\n" + 
				"        \"Description\": \"description for the product 95\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 96,\n" + 
				"        \"Name\": \"Product 96\",\n" + 
				"        \"Description\": \"description for the product 96\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 97,\n" + 
				"        \"Name\": \"Product 97\",\n" + 
				"        \"Description\": \"description for the product 97\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 98,\n" + 
				"        \"Name\": \"Product 98\",\n" + 
				"        \"Description\": \"description for the product 98\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"Id\": 99,\n" + 
				"        \"Name\": \"Product 99\",\n" + 
				"        \"Description\": \"description for the product 99\",\n" + 
				"        \"Image\": \"http://Kishbin.com/ic_people.png\",\n" + 
				"        \"MenuId\": 100\n" + 
				"    }\n" + 
				"]";
	}

	@Override
	public String getDetail(int id) {
		return "{\n" + 
				"\n" + 
				"    \"Id\": " + id +",\n" + 
				"\n" + 
				"    \"Name\": \"Product " + id + "\",\n" + 
				"\n" + 
				"    \"Description\": \"description for the product " + id +"\",\n" + 
				"\n" + 
				"    \"FullDescription\": \"full description for the product\",\n" + 
				"\n" + 
				"    \"Image\": \"http://Kishbin.com/ic_people.png\"\n" + 
				"\n" + 
				"}";
	}

}
