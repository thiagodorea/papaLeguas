import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { faShippingFast, faBox, faHandsHelping, faBan, faArrowAltCircleLeft } from '@fortawesome/free-solid-svg-icons';
import { NgxSpinnerService } from 'ngx-spinner';
import Swal from 'sweetalert2/dist/sweetalert2.js';

import { Pedido } from '../model/pedido.model';
import { RastreioService } from '../services/rastreio.service';

@Component({
  selector: 'app-encomenda',
  templateUrl: './encomenda.component.html',
  styleUrls: ['./encomenda.component.css']
})
export class EncomendaComponent implements OnInit {

  public icons: any = [
    faBox,
    faShippingFast,
    faHandsHelping,
    faBan,
    faArrowAltCircleLeft,
  ]

  private codigo: string;
  public pedido: Pedido;

  constructor(private rastreioService: RastreioService, private router: Router, private route: ActivatedRoute, private spinner: NgxSpinnerService) { }

  ngOnInit(): void {
    this.codigo = this.route.snapshot.paramMap.get('id');

    //buscar na api o pedido
    this.loadPedido();
    this.loadCliente();

  }
  
  loadPedido(): any {
    this.spinner.show();
    this.rastreioService.getEncomendaRastreio(this.codigo)
      .subscribe(
        data => {
          this.pedido = data;
          this.spinner.hide();
        },
        error => {
          Swal.fire('Não encontrado...', 'Digite o código de rastreio correto!', 'error')
          this.spinner.hide();
          this.router.navigate(['rastreio']);
        }
      );
  }
  loadCliente(): any {

  }
}
