![download](https://github.com/Deepakkr3/Food-delivery-platform/assets/115481021/6d713799-ad17-47ec-a8ef-15083e1a09ad)
## 🚀 About Me
I'm a full stack developer...



# Food Delivery Application

This is a Spring Boot application for a food delivery service. It allows users to order food from various restaurants and have it delivered to their location. The application is built using Java, Spring Boot, and various other technologies.


## Require  Tools or IDE
Java 11 or higher
Maven
MySQL (or your preferred database)
IDE (e.g., IntelliJ IDEA, Eclipse)
## API Reference

#### Admin controller

```http
  @GetMapping("/users")
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `na` | `string` | **Required**. NA |

#### Get item

```http
  @GetMapping("/Tokens")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `na`      | `string` | **Required**.  |na

#### Get item

```http
 @GetMapping("/order")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `na`      | `string` | **Required**.  |na


####post Mapping
```http
@PostMapping("/order")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `na`      | `string` | **Required**.  |na

#### Get item

```http
 @GetMapping("/order/id")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**.  |id

#### delete Mapping

```http
@DeleteMapping("/order")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id token`      | `string` | **Required**.  |id, token

####post Mapping
```http
@PostMapping("/signup/addNewUser")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `user`      | `string` | **Required**.  |user


####post Mapping
```http
    @PostMapping("/signIn /email{email}/password/{password}")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `email password`      | `string` | **Required**.  |email, password



####delete Mapping
```http
@DeleteMapping("user/email{email}/password{password}")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `email password`      | `string` | **Required**.  |email, password



## Data structures
ArrayList,sorting Algorithm
## Deployment

To deploy this project run

```bash
  AWS server
```


## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/deepak-kumar-01b417214/)


