/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstoreserver

import (
	"github.com/gin-gonic/gin"
)

type StoreAPI interface {


    // DeleteOrder Delete /v2/store/order/:orderId
    // Delete purchase order by ID 
     DeleteOrder(c *gin.Context)

    // GetInventory Get /v2/store/inventory
    // Returns pet inventories by status 
     GetInventory(c *gin.Context)

    // GetOrderById Get /v2/store/order/:orderId
    // Find purchase order by ID 
     GetOrderById(c *gin.Context)

    // PlaceOrder Post /v2/store/order
    // Place an order for a pet 
     PlaceOrder(c *gin.Context)

}