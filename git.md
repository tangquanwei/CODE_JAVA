# git操作命令

## 1.设置本地用户信息

```bash
# 设置用户名
git config --global user.name "Your Name"
# 设置邮箱
git config --global user.email "email@example.com"
```

## 2.初始化本地库

master默认分支(当前分支)
git bash 可以使用多数linux命令

```bash
git init
```

## 3.查看本地库状态

```bash
git status
```

## 4.添加暂存区

```bash
git add "dir/filename"
```

## 5.提交本地库

```bash
git commit -m "infomation of changes" [filename]
```

## 6.查看历史提交

```bash
git reflog
git log
```

## 7.版本穿梭

```bash
git reset --hard "版本号"
```
