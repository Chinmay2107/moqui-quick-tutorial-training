// Define a map to hold the result
Map<String, Object> resultMap = [:]

// Add random key-value pairs
resultMap.put("key1", "value1")
resultMap.put("key2", 12345)
resultMap.put("key3", true)
resultMap.put("key4", 3.14)
System.out.println("\n\n=============-----"+ec.context.toString()+"--================\n\n")
resultMap.put("Hello", inpara.get('Hello'))
resultMap.put("key5", ["nestedKey": "nestedValue"])

// Return the map
return resultMap
