oauth

[Source1](http://www.baeldung.com/spring-security-oauth-jwt)
[Source2](http://www.tinmegali.com/en/2017/06/25/oauth2-using-spring/)


```
curl trusted-app:secret@localhost:8080/oauth/token -d "grant_type=password&username=user&password=password" | jq
```

```
curl -H "Authorization: Bearer $(curl trusted-app:secret@localhost:8080/oauth/token -d "grant_type=password&username=user&password=password" | jq --raw-output .'access_token')" localhost:8080/api/hello | jq
```

```
 curl -H "Authorization: Bearer $(curl trusted-app:secret@localhost:8080/oauth/token -d "grant_type=password&username=admin&password=password" | jq --raw-output .'access_token')" localhost:8080/api/admin | jq
 ```