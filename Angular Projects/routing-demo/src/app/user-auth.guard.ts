import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserAuthGuard implements CanActivate {
  // using this we can navigate on error
  constructor(private router : Router) { }

  canActivate(route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
    ): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree 
  {
      if(route.params.userId == sessionStorage.getItem('userKey'))
        return true;
      else {
        alert('You need to login first');
        this.router.navigate(['/login'])
        return false;
      }
  
  }
  
}
