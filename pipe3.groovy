pipeline{
agent any
stages{
stage ('Pull'){
steps{
git 'https://github.com/ShubhamUChoudhary/Githubrepop1.git'
}
}
stage ('Build'){
steps{
echo 'Build successful'
}
}
stage ('Test'){
steps{
echo 'Build successful'

}
}
stage ('Deploy'){
steps{
echo 'Build successful'
}
stage ('pre-Deploy'){
steps{
echo 'pre-deploy successful'
}
