<h3>UAA部分</h3>

1、采用authentication_code方式获取token，此方式最安全
  1）获取code，采用get方法
http://localhost:9999/uaa/oauth/authorize?response_type=code&client_id=acme&redirect_uri=http://example.com
  2）获取token，采用post方法
  acme:acmesecret@localhost:9999/uaa/oauth/token?grant_type=authorization_code&client_id=acme&redirect_uri=http://example.com&code=0CUgkq
  
2、采用用户名密码方式获取token，采用POST方法
  acme:acmesecret@localhost:9999/uaa/oauth/token?grant_type=password&username=Myusername&password=Mypassword