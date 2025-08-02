# 检查管理员权限
if (-NOT ([Security.Principal.WindowsPrincipal][Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole([Security.Principal.WindowsBuiltInRole]"Administrator"))
{
    Write-Host "请以管理员身份运行此脚本" -ForegroundColor Red
    exit
}

# 设置基础变量
[Environment]::SetEnvironmentVariable('PYTHONDONTWRITEBYTECODE', '1', 'Machine')
[Environment]::SetEnvironmentVariable('MAVEN_HOME', 'C:\FairylandTech\Envs\Maven\3.8.8', 'Machine')

# 设置嵌套变量（保留变量引用格式）
[Environment]::SetEnvironmentVariable('JAVA_HOME', '%JAVA_HOME_17%', 'Machine')
[Environment]::SetEnvironmentVariable('FairylandFuturePath', '%JAVA_HOME%\bin;%MAVEN_HOME%\bin', 'Machine')

# 修改系统PATH变量
$currentPath = [Environment]::GetEnvironmentVariable('Path', 'Machine')
$newPath = $currentPath + ';%FairylandFuturePath%'
[Environment]::SetEnvironmentVariable('Path', $newPath, 'Machine')

Write-Host "环境变量已成功设置，重启后生效！" -ForegroundColor Green