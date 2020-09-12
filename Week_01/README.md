郭麟的学习笔记
========

****
# Git和GitHub使用

  由于工作的原因，以前没有使用Git和GitHub，此次学习过程中顺便学习了这两个工具的使用，感觉赚到了。虽然老师说了总结不要记流水账，但是我觉得这个总结不单单是交的作业也是自己学习的札记。所以可能还是会比较琐碎的记录我所学到的内容，方便自己日后整理。

## Git的安装和配置

  由于工作的关系，我使用的操作系统都是windows的，因此安装就直接安装windows版本的Git就好。安装了Git后就会有Git Bash方便进行操作。进入Git Bash后目录跟Windows不一样比如我的目录在`e:\homework`,在Git Bash中就是`cd /e/homework`。使用`git init`命令来进行仓库的初始化操作。然后使用`git config --global user.name "username"`来设置用户名称。`git config --global user.email "abei1@163.com" ` 来设置仓库的邮箱。使用`git config --global --list`来查看配置信息。

## Git和GitHub的关联

  首先fork我们作业的仓库。然后在本地Git Bash中进入我的仓库，然后输入`git remote`命令来设置远端仓库的对应表。具体命令如下`git remote add origin git@github.com:abeisnow/algorithm016.git` 后面的SSH地址是在仓库的Code按钮下找的。使用`git remote`来查看是否设置成功。使用`ssh-keygen`来生成公私钥对，具体命令如下`ssh-keygen -t rsa -C "abei1@163.com"` 根据返回信息找到公钥数据，然后去github中进行设置。在SSH and GPG keys中填写我们的公钥。使用`SSH -T git@github.com`来验证绑定是否成功。本地使用`git add .`来将自己修改的内容上传至本地缓存区，然后使用`git commit -m "remark"`来进行提交。最后使用`git push -u origin master`将自己修改的结果push到远程仓库。也可以用`git pull homework master`拉取远程仓库的内容。第一次关联后可以使用`git clone git@github.com:abeisnow/algorithm016.git`来进行版本初始化，将远端仓库内容直接拿到本地。
	
****

# 数组、链表、跳表的基本实现和特性

# 栈和队列的实现与特性

# 总结
