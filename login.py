# -*- coding:utf-8 -*-
import  unittest
import urllib2
import urllib
'''url="http://192.168.0.238/server/wechat/web/app/public/login"
data={}
data['account']=18113133187
data['password']=123456
#对data进行编码
data=urllib.urlencode(data)
#组合
response=urllib2.Request(url,data)
#发送打开
response=urllib2.urlopen(response)
#读出来
response=response.read()
#转码打印
print response.decode("utf-8")'''

url="http://192.168.0.238/server/wechat/web/app/public/login"
def A(account,password):
    data = {}
    data['account'] =account
    data['password']=password
    data = urllib.urlencode(data)
    response = urllib2.Request(url, data)
    response = urllib2.urlopen(response)
    response = response.read()
    return response.decode("utf-8")






