# -*- coding:utf-8 -*-
import  unittest
from login import A

class Login(unittest.TestCase):
    def setUp(self):
        print "start"
    def test_1(self):
         self.assertIn('200',A(18113133187,666666))
    def test_2(self):
         self.assertIn('200',A(18113133187,666660))

    def tearDown(self):
        print "end"
if __name__ == '_mian_':
    # 测试集
    suite = unittest.TestSuite()
    suite.addTest(Login('test_1'))
    suite.addTest(Login('test_2'))
    #运行
    runner = unittest.TextTestRunner()
    runner.run(suite)



