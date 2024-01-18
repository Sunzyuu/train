# Dev

## 创建mysql数据库容器
```shell
docker run -p 3307:3306 --name train -e MYSQL_ROOT_PASSWORD=root -d mysql:8.0.29
```