SUMMARY = "Build and publish crates with pyo3, rust-cpython and cffi bindings as well as rust binaries as python packages"
HOMEPAGE = "https://github.com/pyo3/maturin"
AUTHOR = " konstin <konstin@mailbox.org>, messense <messense@icloud.com>"
LICENSE = "MIT & Apache-2.0"
LIC_FILES_CHKSUM = "\
    file://license-mit;md5=85fd3b67069cff784d98ebfc7d5c0797 \
    file://license-apache;md5=1836efb2eb779966696f473ee8540542 \
"

SRC_URI[sha256sum] = "ef3f42af453d64f233b99543c3001bee645019a9c2022c7972210a9cacb5301f"

PYPI_PACKAGE = "maturin"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python_setuptools3_rust

#do_compile[network] = "1"

RDEPENDS:${PN} += " \
"

BBCLASSEXTEND = "native nativesdk"
