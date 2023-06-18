db.roles.insertMany([
   { name: "ROLE_USER" },
   { name: "ROLE_MODERATOR" },
   { name: "ROLE_ADMIN" },
])



localhost:8080/api/auth/signup
{
    "username": "test",
    "password": "test",
    "role": "ROLE_USER"
}

localhost:8080/api/auth/signin
{
    "username": "test",
    "password": "test"
}
