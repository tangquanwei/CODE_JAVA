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
git add <dir/filename>
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
git reset --hard <版本号>
```

## 8.分支操作

```bash
# 创建分支
git branch <分支名>
# 或者 创建并切换到新的dev分支
git checkout -b dev
# 或者 创建并切换到新的dev分支
git switch -c dev
# 直接切换到已有的master分支
git switch master

# 查看分支
git branch -v 
# 或者 
git branch

# 切换分支
git checkout <分支名>

# 合并分支(吧指定分支合并到当前分支)
# 只会修改当前分支
git merge 

# 删除分支
git branch -d <分支名>
```

合并冲突(分支和main都有修改和提交)

```bash
git merge testbranch

tang
<<<<<<< HEAD
=======
quanwei tang
quanwei tang
quanwei tang
quanwei tang
test branch
>>>>>>> testbranch
tang
tang
tang
tang
tang
tang
tang quanwei

```

修改为想要的样子

```bash
tang
quanwei tang
quanwei tang
quanwei tang
quanwei tang
test branch
tang
tang
tang
tang
tang
tang
tang quanwei
```

```bash
# 再添加暂存,提交
git add a.txt

git commit -m "message" # 后面不加文件名
```
