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
git merge netty-im/master

if [ $? -eq 0 ]; then
  git log 
  read -p "Wether to run git push [y/n]:" Option
  echo $Option

  if [ $Option = 'y' ]; then
    git push
  else
	  echo "Not push, if you would like to do it , run git push"
  fi
fi
