google-xoauth-samples
=====================

Google Xoauth Samples (com.google.code.samples.xoauth). Useful for connecting to Gmail IMAP via OAuth (v1).

Original: http://code.google.com/p/google-mail-xoauth-tools/source/browse/trunk/java/com/google/code/samples/xoauth

Sample code
===========
```scala
import com.google.code.samples.xoauth.XoauthAuthenticator
import net.oauth.OAuthConsumer

val app_consumer_key = "..."
val app_consumer_secret = "..."
val email_addr = "a@gmail.com"
val user_oauth_token = "..."
val user_oauth_secret = "..."

XoauthAuthenticator.initialize()
val oauthConsumer = new OAuthConsumer(null, app_consumer_key, app_consumer_secret, null)
val imap = XoauthAuthenticator.connectToImap(
  "imap.googlemail.com", 993, email_addr, user_oauth_token, user_oauth_secret, oauthConsumer, true
)
```
