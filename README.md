# SunFavorite🌟空想家网页收藏夹
## 1. 主要功能是🌍
- 微信公众号验证码登录
- 个人网页收藏(公开收藏/私有收藏)
- 收藏广场，显示其他用户公开收藏
- 网页收藏搜索
- 个人中心(个人名称+头像)
## 2. 技术的选型和基础环境搭建配置是🪐
**技术的选型🛩：**
1. 数据库使用MySQL
2. 缓存使用Redis
3. 使用WXJava对接微信公众号
4. 搜索功能使用ElasticSearch，分词使用IK分词器
5. MySQL和ElasticSearch的数据同步使用Canal，这个Canal包含Canal-Server和Canal-Adapter
6. 持久层框架使用SpringData JPA(如果有复杂的查询不推荐)
7. 基础框架使用SpringBoot
8. 模板引擎使用FreeMarker
9. 前端使用BootStrap做布局，也使用到了Layui部分组件

**Docker基础环境的搭建博客🚀：**[点击进入](https://wql.luoqin.ltd/2022/10/29/sunfavorite%e9%a1%b9%e7%9b%ae%e5%9f%ba%e7%a1%80%e7%8e%af%e5%a2%83%e6%90%ad%e5%bb%ba/)

## 3. 拉下项目如何运行是🛰
**步骤🧭：**
1. 注册个人公众号
2. 修改application.yml文件中的配置
3. 使用Natapp做内网穿透进行测试
4. 修改前端的二维码





