##UAA部分

###通过验证码方式初始化认证
http://localhost:9999/uaa/oauth/authorize?response_type=code&client_id=acme&redirect_uri=http://example.com

如果用户已经认证，那么页面将重定向到指定的页面，并且带上验证码，例如：e.g. http://example.com/?code=jYWioI.

这个验证码将用于获取访问资源的Access_token

curl acme:acmesecret@localhost:9999/uaa/oauth/token -d grant_type=authorization_code -d client_id=acme -d redirect_uri=http://example.com -d code=0CUgkq