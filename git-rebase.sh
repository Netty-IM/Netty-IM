#!/bin/bash 
# fetch and merge git@gitlab.com/Netty-IM/Netty-IM.git with 
# git@gitlab.com/your-name/Netty-IM.git

git remote get-url netty-im

if [ $? -eq 0 ]; then 
  echo " netty-im remote branch already exist"
else 
  git remote add netty-im git@github.com:Netty-IM/Netty-IM.git
fi

git fetch netty-im master
git checkout master 
git rebase netty-im/master

