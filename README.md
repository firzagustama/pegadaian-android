## API
##### Product Endpoint
* Return list of products
```http
GET /product
```
* Return list of products in chart
```http
GET /product/chart
```
* Store or update product
```http
POST /product
```
| Body | Type | Description |
| :--- | :--- | :--- |
| `id` | `int` | Product Id, **Required** to update product chart|
| `imageUrl` | `string` | **Optional** |
| `name` | `string` | **Optional** |
| `price` | `int` | **Optional** |
| `chartQty` | `int` | **Optional** |
| `inChart` | `int` | **Required** 0 - 1 indicated that the item is in chart |

##### Transaction Endpoint
* Return list of transaction
```http
GET /transaction
```
* Store or update transaction
```http
POST /transaction
```
| Body | Type | Description |
| :--- | :--- | :--- |
| `id` | `int` | Transaction Id, **Required** to update product chart|
| `customerName` | `string` | **Optional** |
| `pay_amount` | `string` | **Optional** Customer pay amount |

##### Detail Endpoint
* Return list of products transaction
```http
GET /detail
```
* Store or update produtcs transaction
```http
POST /detail
```
| Body | Type | Description |
| :--- | :--- | :--- |
| `productId` | `int` | **Required**|
| `transactionId` | `int` | **Required** |
| `qty` | `int` | **Required** The quantity of each product in transaction |
