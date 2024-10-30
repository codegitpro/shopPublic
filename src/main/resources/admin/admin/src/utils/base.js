const base = {
    get() {
                return {
            url : "http://localhost:8080/shop/",
            name: "shop",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shop/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "会员商城管理系统"
        } 
    }
}
export default base
