import groovy.json.JsonSlurper
import groovy.json.JsonOutput

// Retrieve the order JSON from the ec.context map
def orderJson = ec.context.order
System.out.println("\n\n\n~~~~~~~~~~~~~~~~~~~"+ec.context.order+"~~~~~~~~~~~~~~~~~~~\n\n\n")

// Parse the JSON into a Map
// def orderMap = new JsonSlurper().parseText(orderJson)
def orderMap = orderJson

// Modify the "financial_status" and "user_id" fields
orderMap.financial_status = "partial"
orderMap.user_id = "abcd"


// Store the modified JSON in the ec.context map
ec.context.modifiedOrderMap = orderMap

Map<String, Object> resultMap = [:]
resultMap.put("modifiedOrderMap", orderMap)

return resultMap

System.out.println("\n\n\n~~~~~~~~~~~~~~~~~~~"+ec.context.modifiedOrderJson+"~~~~~~~~~~~~~~~~~~~\n\n\n")
