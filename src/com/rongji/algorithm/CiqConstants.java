package com.rongji.algorithm;

import java.text.SimpleDateFormat;
import java.util.HashMap;

/**  
 * Description: 通用定值编码类
 * Copyright:   Copyright (c)2017
 * Company:     rongji  
 * @author:     黄庆炬
 * @version:    1.0  
 * Create at:   2017-6-16 14:08:57  
 *  
 * Modification History:  
 * Date         Author       Version     Description  
 * ------------------------------------------------------------------  
 * 2017-6-16    黄庆炬                        1.0         创建通用定值编码类
 */
public class CiqConstants {

	/**********SESSION用户相关**********/
	public static final String LOGIN_USER_KEY = "com.rongji.dfish.LOGIN_USER_KEY";

	public static final String LOGIN_USER_CODE_KEY = "com.rongji.dfish.LOGIN_USER_CODE_KEY";

	public static final String LOGIN_USER = "com.rongji.dfish.LOGIN_USER";

	// 仅当前级
	public final static String DATA_STATUS_LOCAL = "0";
	// 级联下级
	public final static String DATA_STATUS_SUB = "1";

	// 机构类型直属局
	public final static String ORG_PORPERTYPE_Z = "01";
	// 分支局
	public final static String ORG_PORPERTYPE_F = "02";
	// 办事处
	public final static String ORG_PORPERTYPE_B = "03";
	// 其他
	public final static String ORG_PORPERTYPE_Q = "99";

	// 框架 顶部高度
	public final static String INDEX_TOP_HEIGHT = "55";

	// 门户 各个豆腐块间距
	public final static String HOMEPAGE_CONTENT_PADDING = "8";

	// 列表 高度
	public final static String ROW_HEIGHT = "40";

	// 标题栏高度
	public final static String LEFT_TITLE_HEIGHT = "43";
	// 搜索栏高度
	public final static String LEFT_SEARCH_HEIGHT = "52";

	// 翻页栏默认高度
	public final static String PAGE_PANEL_HEIGHT = "50";

	// tab的宽度
	public final static String TAB_WIDTH = "130";

	// 机构根节点编号
	public final static String ORG_ROOT = "000000";

	// 首页菜单编号
	public final static String HOME_FUNC_ID = "0100000000";

	// 机构根节点路径
	public final static String ORG_ROOT_PATH = "000";

	// 状态 - 可用
	public final static String STATUS_USABLE = "1";
	// 状态 - 禁用
	public final static String STATUS_DISABLE = "0";
	// 状态 - 隐藏
	public final static String STATUS_HIDE = "2";
	// 状态 - 标记删除
	public final static String STATUS_DELETE = "9";

	// 值-否
	public final static String VALUE_FALSE = "0";
	// 值-是
	public final static String VALUE_TRUE = "1";

	// 根节点编号
	public final static String ROOT_PARENT_ID = "0000000000000000";

	// 分页-每页最大数量
	public static int MAX_PAGE_SIZE = 512;

	public static final String TYPE_EXCEL = "xls";

	// 操作代码 - 机构维护
	public static final String OPER_CODE_JGWH = "00";
	// 操作代码 -人员维护
	public static final String OPER_CODE_YGWH = "01";
	// 操作代码-数据权限
	public static final String OPER_CODE_SJQX = "02";
	// 操作代码-角色维护
	public static final String OPER_CODE_JSWH = "03";
	// 操作代码-数据字典
	public static final String OPER_CODE_SJZD = "04";
	public static final String SYSTEM_USER = "SYSTEM";
	public static final String SYSTEM_USER_NAME = "系统";

	// 缓存通道实现 1 内存 2 redis
	public static final String CACHE_IMPL = "system.msg.cacheImpl";
	public static final String CACHE_MEMORY = "1";
	public static final String CACHE_REDIS = "2";
	// 系统人员ID
	public static final String SYS_USER_ID = "system";
	public static final String SYS_USER_NAME = "系统";

	/**********缓存相关**********/
	public static final String CACHE_USER_NAME = "USER_NAME";
	public static final String CACHE_ORG_NAME = "ORG_NAME";
	public static final String CACHE_ROLE_NAME = "ROLE_NAME";

	/**
	 * 精确时间格式,在I-TASK中时间最高精确到秒
	 */
	public static final SimpleDateFormat DEFAULT_DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 精确到分钟的时间格式,多处设置显示用该格式.
	 */
	public static final SimpleDateFormat MINUTE_DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

	/**
	 * 精确到分钟的时间格式,多处设置显示用该格式.
	 */
	public static final SimpleDateFormat HM_DATEFORMAT = new SimpleDateFormat("HH:mm");

	/**
	 * 精确到天的时间格式,多处设置显示用该格式.
	 */
	public static final SimpleDateFormat MD_DATEFORMAT = new SimpleDateFormat("M-d");

	/**
	 * 精确到年的时间格式,多处设置显示用该格式.
	 */
	public static final SimpleDateFormat YEAR_DATEFORMAT = new SimpleDateFormat("yyyy");

	/**
	 * 简短时间格式,精确到天
	 */
	public static final SimpleDateFormat SHORT_DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * 仅月日格式,MM-dd
	 */
	public static final SimpleDateFormat DF_MONTHDAY = new SimpleDateFormat("MM-dd");

	/**
	 * 仅月日格式,MM-dd
	 */
	public static final SimpleDateFormat DF_SDATEFORMAT = new SimpleDateFormat("yyMMdd");

	/**
	 * 根据菜单取得所对应的openCode
	 */
	public static final HashMap<String, String> FUNC_OPEN_CODE_MAP = new HashMap<String, String>();
	static {
		FUNC_OPEN_CODE_MAP.put("0902010000", OPER_CODE_JGWH);
		FUNC_OPEN_CODE_MAP.put("0902030000", OPER_CODE_YGWH);
		FUNC_OPEN_CODE_MAP.put("0902080000", OPER_CODE_SJQX);
		FUNC_OPEN_CODE_MAP.put("0902020000", OPER_CODE_JSWH);

	}
	// redies ip
	public static final String REDIS_IP = "systems.redis.ip";
	// redies psw
	public static final String REDIS_AUTH = "systems.redis.auth";

	/**
	 * 数据字典回调类对应KEY
	 */
	public final static String CODE_MAN_COUNTRY_KEY = "ZGXZQH";// 与sys_code_type表中的TYPE_ID
																// 一致
	public final static String CODE_MAN_WORLDDISTRICT_KEY = "GJDQ";
	public final static String CODE_MAN_MEASUREMENT_KEY = "JLDW";
	public final static String CODE_MAN_TRANSPORT_KEY = "YSFS";
	public final static String CODE_MAN_FOREIGNPORT_KEY = "GWKA";
	public final static String CODE_MAN_DOMESTICPORT_KEY = "GNKA";
	public final static String CODE_MAN_CURRENCY_KEY = "BZ";
	public final static String CODE_MAN_TRADE_KEY = "MYFS";
	public final static String CODE_MAN_USE_KEY = "YT";
	public final static String CODE_MAN_HS_CODE_KEY = "HS_CODE";
	public final static String CODE_MAN_CIQ_CODE_KEY = "CIQ_CODE";
	/**
	 * 公告管理相关-类别父功能
	 */
	public static final String PUB_CATEGORY_PARENT_CODE = "1bajno77cf8s0000";

	// 信息状态-草稿
	public static final String NOTICE_STATUS_CG = "0";
	// 信息状态-发布
	public static final String NOTICE_STATUS_FB = "1";
	// 信息状态-删除
	public static final String NOTICE_STATUS_SC = "2";
	// 信息状态-已发布
	public static final String NOTICE_STATUS_YFB = "3";
	/**
	 * 管理端公告
	 */
	public static final String NOTICE_TYPE_MANAGE = "0";

	/**
	 * 企业端公告
	 */
	public static final String NOTICE_TYPE_ENT = "1";
	/**
	 * 查看数据字典-通知公告
	 */
	public static final String NOTICE_TYPE_NOTIC = "2";
	/**
	 * 查看数据字典-动态信息
	 */
	public static final String NOTICE_TYPE_DYNAMIC = "3";

	/**
	 * 公告置顶标识
	 */
	public static final String NOTICE_TOP_TRUE = "1";

	/**
	 * 非置顶公告标识
	 */
	public static final String NOTICE_TOP_FALSE = "0";

	/**
	 * 数据交换-数据状态未读
	 */
	public static final String DATAEXCHANGE_STATUS_UNREAD = "0";

	/**
	 * 数据交换-数据状态已读
	 */
	public static final String DATAEXCHANGE_STATUS_READ = "1";

	// 默认 皮肤
	public static final String DEFAULT_SKIN_MODE = "0";

	// 搜索推荐 默认一次性加载所有搜索数据，根据 关键词匹配
	public static final String DEFAULT_SUGGEST_MODE = "0";

	// 登录验证 0:开启验证码 1：无需验证码 不开启
	public static final String DEFAULT_LOGIN_CHECK_CODE = "1";

	// 登录验证 0:开启验证码 1：无需验证码 不开启
	public static final String DEFAULT_PRODUCT_NAME = "CIQ_FRAME(检疫检验产品基础框架)";

	// 开关参数-模块参数-搜索推荐-用户搜索
	public static final String MOD_SUGGEST_USER = "mod.suggest.user";
	// 开关参数-模块参数-搜索推荐-机构搜索
	public static final String MOD_SUGGEST_ORG = "mod.suggest.org";

	// 开关参数-模块参数-登录认证-校验码
	public static final String MOD_LOGIN_CHECKCODE = "mod.login.checkCode";

	// 开关参数-模块参数-人员管理-加密方式-汉字转化编码
	public static final String MOD_USER_PWD_ENCODING = "mod.user.pwd.encoding";
	// 开关参数-模块参数-人员管理-加密方式-密码加密秘钥
	public static final String MOD_USER_PWD_SECRETKEY = "mod.user.pwd.secretKey";
	// 开关参数-模块参数-人员管理-加密方式-密码加密算法
	public static final String MOD_USER_PWD_ALGORITHMS = "mod.user.pwd.algorithms";
	// 开关参数-模块参数-人员管理-加密方式-默认密码
	public static final String MOD_USER_PWD_DEFAULT = "mod.user.pwd.default";
	// 开关参数-模块参数-人员管理-加密方式-密文转化编码 BASE32编码
	public static final String MOD_USER_PWD_PRESENTSTYLE = "mod.user.pwd.presentStyle";
	// 开关参数-模块参数-存储设置-文件上传大小限制（单位：M）
	public static final String MOD_SYS_FILESIZELIMIT = "mod.sys.fileSizeLimit";
	// 开关参数-模块参数-存储设置-文件保存路径
	public static final String MOD_SYS_ATTACHURL = "mod.sys.attachUrl";
	// 开关参数-系统信息-产品授权-产品名称
	public static final String MOD_SYS_PRODUCT_NAME = "mod.sys.productName";

	// 密码最小长度
	public static final String MOD_PASSWORD_LENGTH_MIN = "mod.user.passwordLength.min";
	// 密码最大长度
	public static final String MOD_PASSWORD_LENGTH_MAX = "mod.user.passwordLength.max";

	// 框架皮肤
	public static final String MOD_SYS_SKIN = "mod.sys.skin";

	// 系统管理员
	public static final String MOD_SYS_ADMIN = "mod.sys.admin";

	/**********↓数据字典↓**********/
	/**
	 * 动态数据字典插件
	 */
	public static final String CODE_PLUGIN_DYNAMIC = "CODE_DYNAMIC";
	/**
	 * 静态数据字典插件
	 */
	public static final String CODE_PLUGIN_STATIC = "CODE_STATIC";
	/**
	 * 机构类型
	 */
	public static final String CODE_TYPE_ORG_TYPE = "JGLX";
	/**
	 * 民族
	 */
	public static final String CODE_TYPE_NATION = "NATION";
	/**
	 * 处理方式
	 */
	public static final String CODE_TYPE_CLFS = "CLFS";
	/**
	 * FIXME 测试
	 */
	public static final String DICT_TYPE_TEST = "11";
	/**
	 * 静态数据字典--审核状态
	 */
	public static final String CHECK_STATUS = "CHECK_STATUS";
	/**
	 * 静态数据字典--注销状态
	 */
	public static final String CANCEL_STATUS = "CANCEL_STATUS";
	/**
	 * 静态数据字典--诚信等级
	 */
	public static final String INT_LEV = "INT_LEV";
	/**
	 * 静态数据字典--申请类型
	 */
	public static final String IND_UPDATE = "IND_UPDATE";
	/**
	 * 静态数据字典--船型
	 */
	public static final String SUP_SHIP_TYPE = "SHIP_TYPE";
	/**
	 * 静态数据字典--检查类型
	 */
	public static final String SUP_CHECK_TYPE = "CHECK_TYPE";
	/**
	 * 静态数据字典--检查类型(没有办证监督)
	 */
	public static final String SUP_CHECK_DEFE_TYPE = "CHECK_TYPE_DEFE";
	/**
	 * 静态数据字典--维护类别
	 */
	public static final String SUP_TYPE = "SUP_TYPE";
	/**********↑数据字典↑**********/

	/**********↓静态数据字典详细项↓**********/
	/**
	 * [下拉列表第一列]编码
	 */
	public static final String DEFAULT_SELECT = "-1";
	/**
	 * [下拉列表第一列]名称
	 */
	public static final String DEFAULT_SELECT_NAME = "---请选择---";
	/**
	 * [审核标识-0:未审核]编码
	 */
	public static final String CHECK_UN = "3";
	/**
	 * [审核标识-0:未审核]名称
	 */
	public static final String CHECK_UN_NAME = "未受理";
	/**
	 * [审核标识-1:审核通过]编码
	 */
	public static final String CHECK_Y = "4";
	/**
	 * [审核标识-1:审核通过]名称
	 */
	public static final String CHECK_Y_NAME = "通过";
	/**
	 * [审核标识-2:审核退回]编码
	 */
	public static final String CHECK_N = "5";
	/**
	 * [审核标识-2:审核退回]名称
	 */
	public static final String CHECK_N_NAME = "退回";
	/**
	 * [注销标识-0:未注销]编码
	 */
	public static final String CANCEL_N = "0";
	/**
	 * [注销标识-0:未注销]名称
	 */
	public static final String CANCEL_N_NAME = "未注销";
	/**
	 * [注销标识-1:已注销]编码
	 */
	public static final String CANCEL_Y = "1";
	/**
	 *  [注销标识-1:已注销]名称
	 */
	public static final String CANCEL_Y_NAME = "已注销";
	/**
	 *  [诚信等级-A]A
	 */
	public static final String INT_LEV_A = "A";
	/**
	 *  [诚信等级-B]B
	 */
	public static final String INT_LEV_B = "B";
	/**
	 *  [诚信等级-C]C
	 */
	public static final String INT_LEV_C = "C";

	/**
	 * [申请类型-I:新增]编码
	 */
	public static final String IND_UPDATE_I = "I";
	/**
	 * [申请类型-I:新增]名称
	 */
	public static final String IND_UPDATE_I_NAME = "新增";
	/**
	 * [申请类型-U:更新]编码
	 */
	public static final String IND_UPDATE_U = "U";
	/**
	 * [申请类型-U:更新]名称
	 */
	public static final String IND_UPDATE_U_NAME = "更新";
	/**
	 * [申请类型-M:变更]编码
	 */
	public static final String IND_UPDATE_M = "M";
	/**
	 * [申请类型-M:变更]名称
	 */
	public static final String IND_UPDATE_M_NAME = "变更";
	/**
	 * [申请类型-L:注销]编码
	 */
	public static final String IND_UPDATE_L = "L";
	/**
	 *   [申请类型-L:注销]名称
	 */
	public static final String IND_UPDATE_L_NAME = "注销";
	/**
	 * [船型] CONTAINER 集装箱船;BULK 散杂货船;LINER 邮轮;OTHER其他
	 */
	public static final String SUP_SHIP_TYPE_CONTAINER_CODE = "1";
	public static final String SUP_SHIP_TYPE_CONTAINER_NANE = "集装箱船";
	public static final String SUP_SHIP_TYPE_BULK_CODE = "2";
	public static final String SUP_SHIP_TYPE_BULK_NANE = "散杂货船";
	public static final String SUP_SHIP_TYPE_LINER_CODE = "3";
	public static final String SUP_SHIP_TYPE_LINER_NANE = "邮轮";
	public static final String SUP_SHIP_TYPE_OTHER_CODE = "4";
	public static final String SUP_SHIP_TYPE_OTHER_NANE = "其他";
	/**
	 * [检查类型] RENEWAL 换证检查; ROUTINE 日常监督; SPECIAL 专项监督
	 */
	public static final String SUP_CHECK_TYPE_RENEWAL_CODE = "1";
	public static final String SUP_CHECK_TYPE_RENEWAL_NAME = "换证检查";
	public static final String SUP_CHECK_TYPE_ROUTINE_CODE = "2";
	public static final String SUP_CHECK_TYPE_ROUTINE_NAME = "日常监督";
	public static final String SUP_CHECK_TYPE_SPECIAL_CODE = "3";
	public static final String SUP_CHECK_TYPE_SPECIAL_NAME = "专项监督";
	/**
	 * [维护类别]  维护类别【1：评分表 2：登记表】
	 */
	public static final String SUP_TYPE_SCORE_CODE = "1";
	public static final String SUP_TYPE_SCORE_CODE_NAME = "评分表";
	public static final String SUP_TYPE_REGISTER_CODE = "2";
	public static final String SUP_TYPE_REGISTER_CODE_NAME = "登记表";
	
	
	/**********↑静态数据字典详细项↑**********/

	/**********↓附件模块↓**********/
	public static final String FILE_LINK_TEST = "FILE_TEST";
	/**
	 * 人员头像
	 */
	public static final String FILE_LINK_USER_PHOTO = "USER_PHOTO";
	/**********↑附件模块↑**********/

	/**
	 * 菜单-首页
	 */
	public static final String MENU_HOME = "0100000000";
	
	/**
	 * 缓存--机构索引值
	 */
	public static final String SYS_ORGANIZE = "sys_organize";
}
