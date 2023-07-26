const swaggerUi = require("swagger-ui-express");
const app = require('./app');
const swaggerDocs = require("../swagger.json");

app.use("/api-docs", swaggerUi.serve, swaggerUi.setup(swaggerDocs));

app.listen(1001, () => console.log('Server running on PORT 1001'));