
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccessedComponent } from './components/accessed/accessed.component';
import { ListAccessedComponent } from './components/list-accessed/list-accessed.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'accessed' },

  { path: 'accessed', component: AccessedComponent },

  { path: 'list-accessed', component: ListAccessedComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
