package br.ueg.tc.pipa_integrator.institutions;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KeyValue {
    private String key;
    private String value;
}
