# -*- coding:utf-8 -*-
import  urllib2
import  urllib

url="http://beta.izhangmai.com/server/shop/web/app/statistic/index"
data={}
data['token']='6afb91fde7fdfaa7b1cacbcd34e9d4de'
data['end_date']=1508138104
data['start_date']=1508083200
#将data进行编码
data=urllib.urlencode(data)
#将data,url进行发送
xy=urllib2.Request(url,data)
#打开请求
xy=urllib2.urlopen(xy)
#读出
xy=xy.read()
#转码
print xy.decode("utf-8")