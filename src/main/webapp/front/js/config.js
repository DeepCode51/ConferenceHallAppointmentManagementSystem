
var projectName = '白云会议管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '会议室',
	url: './pages/huiyishi/list.html'
}, 

{
	name: '公告信息',
	url: './pages/news/list.html'
},
{
	name: '留言板',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmu8xr0/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-album","buttons":["新增","查看","修改","删除"],"menu":"部门","menuJump":"列表","tableName":"bumen"}],"menu":"部门管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除","使用记录"],"menu":"会议室","menuJump":"列表","tableName":"huiyishi"}],"menu":"会议室管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除","审核"],"menu":"会议室预约","menuJump":"列表","tableName":"huiyishiyuyue"}],"menu":"会议室预约管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"会议文件","menuJump":"列表","tableName":"huiyiwenjian"}],"menu":"会议文件管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除"],"menu":"设备信息","menuJump":"列表","tableName":"shebeixinxi"}],"menu":"设备信息管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","修改","删除"],"menu":"使用记录","menuJump":"列表","tableName":"shiyongjilu"}],"menu":"使用记录管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","会议室预约"],"menu":"会议室列表","menuJump":"列表","tableName":"huiyishi"}],"menu":"会议室模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"会议室预约","menuJump":"列表","tableName":"huiyishiyuyue"}],"menu":"会议室预约管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看"],"menu":"会议文件","menuJump":"列表","tableName":"huiyiwenjian"}],"menu":"会议文件管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","会议室预约"],"menu":"会议室列表","menuJump":"列表","tableName":"huiyishi"}],"menu":"会议室模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
