package business.sys.sec.handler;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 사용자의 정보 VO객체
 * --------------------------------------------------
 * 		수정일			수정자			수정내용
 * --------------------------------------------------
 * 	2018.08.14			vestap개발		최초 작성
 * --------------------------------------------------
 * @author vestap 개발
 * @since 2018.08.14
 *
 */

public class BusinessUserDetails implements UserDetails {
	
	private static final long serialVersionUID = 3978365858447784518L;
	
	private String user_id;
	private String user_nm;
	private String user_auth;
	private String user_dist;
	private String user_district;//취약성평가 최근 행정구역
	private String user_rcp;
	private String user_scr;
	private String user_fld;
	private String user_access;
	private String authority;
	private Collection<? extends GrantedAuthority> authorities;
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_nm() {
		return user_nm;
	}

	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}
	
	public String getUser_auth() {
		return user_auth;
	}

	public void setUser_auth(String user_auth) {
		this.user_auth = user_auth;
	}

	public String getUser_dist() {
		return user_dist;
	}

	public void setUser_dist(String user_dist) {
		this.user_dist = user_dist;
	}

	public String getUser_rcp() {
		return user_rcp;
	}

	public void setUser_rcp(String user_rcp) {
		this.user_rcp = user_rcp;
	}

	public String getUser_scr() {
		return user_scr;
	}

	public void setUser_scr(String user_scr) {
		this.user_scr = user_scr;
	}

	public String getUser_fld() {
		return user_fld;
	}

	public void setUser_fld(String user_fld) {
		this.user_fld = user_fld;
	}
	
	public String getUser_access() {
		return user_access;
	}

	public void setUser_access(String user_access) {
		this.user_access = user_access;
	}

	/**
	 * @return 사용자 권한(DB)
	 */
	public String getAuthority() {
		return authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	/**
	 * @return 계정의 권한 목록
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}
	
	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	/**
	 * @return password
	 * 사용하지 않는다.
	 */
	@Override
	public String getPassword() {
		return null;
	}
	
	/**
	 * @return 사용자 ID
	 * 사용하지 않도록 한다.
	 */
	@Override
	public String getUsername() {
		return this.user_id;
	}
	
	/**
	 * @return 계정이 만료 되었는지를 확인
	 * true: 만료되지 않음
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	/**
	 * @return 계정이 잠겨있는지를 확인
	 * true: 잠겨있지 않음
	 */
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	/**
	 * @return 계정의 password가 만료 되었는지 확인
	 * true: 만료되지 않음
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	/**
	 * @return 사용 가능한 계정인지 확인
	 * true: 사용가능
	 */
	@Override
	public boolean isEnabled() {
		return true;
	}

	public String getUser_district() {
		return user_district;
	}

	public void setUser_district(String user_district) {
		this.user_district = user_district;
	}
	
}
